package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: CPU Identification
// Category: general/control

trait CPUID extends InstructionDefinition {
  val mnemonic = "CPUID"
}

object CPUID extends ZeroOperands[CPUID] with CPUIDImpl

trait CPUIDImpl extends CPUID {
  implicit object CPUID_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0xA2)
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
