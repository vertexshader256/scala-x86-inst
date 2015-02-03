package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move with Sign-Extension
// Category: general/conver

object MOVSX extends InstructionDefinition("MOVSX") with MOVSXImpl

trait MOVSXLow {
  implicit object MOVSX_0 extends MOVSX._2[r16, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBE) /r
  }

  implicit object MOVSX_1 extends MOVSX._2[r32, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBE) /r
  }

  implicit object MOVSX_2 extends MOVSX._2[r64, rm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBE) /r
    override def prefix = REX.W(true)
  }

  implicit object MOVSX_3 extends MOVSX._2[r32, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBF) /r
  }

  implicit object MOVSX_4 extends MOVSX._2[r64, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBF) /r
    override def prefix = REX.W(true)
  }
}

trait MOVSXImpl extends MOVSXLow {
  implicit object MOVSX_5 extends MOVSX._2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0xBF) /r
  }
}
